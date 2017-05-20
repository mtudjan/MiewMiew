import {AfterContentInit, AfterViewInit, Component} from "@angular/core";

declare const google: any;
declare const subscribeToGoogleMapInit: any;

@Component({
  selector: 'app-maps',
  templateUrl: './maps.component.html',
  styleUrls: ['./maps.component.scss']
})
export class MapsComponent implements AfterViewInit {
  lat = 46.269888;
  lng = 16.3482354;
  initializedMap = false;


  initMap() {
    const crnec = {lat: this.lat, lng: this.lng};
    const mapElement = document.getElementById('map');
    if (!mapElement || this.initializedMap) {
      return;
    }
    this.initializedMap = true;
    const map = new google.maps.Map(document.getElementById('map'), {
      zoom: 4,
      center: crnec
    });
    const marker = new google.maps.Marker({
      position: crnec,
      map: map
    });
  }

  initMapTimeout() {
    const that = this;
    setTimeout(() => that.initMap(), 100);
    return ' ';
  }

  ngAfterViewInit() {
    const that = this;
    subscribeToGoogleMapInit(() => {
      setTimeout(() => that.initMap(), 2000);
    });
  }
}
