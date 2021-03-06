//
//  MapInteractor.swift
//  HGSS
//
//  Created by Nikola Majcen on 20/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//
//  This file was generated by the 🐍 VIPER generator
//

import Foundation

final class MapInteractor {
    
    let _apiService = APIService()
}

// MARK: - Extensions -

extension MapInteractor: MapInteractorInterface {
    
    func getUsersLocations(completion: @escaping (Result<[User]>) -> Void) {
        _apiService.getUsersLocations(completion: completion)
    }
}
