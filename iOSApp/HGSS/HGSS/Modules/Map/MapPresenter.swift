//
//  MapPresenter.swift
//  HGSS
//
//  Created by Nikola Majcen on 20/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//
//  This file was generated by the 🐍 VIPER generator
//

import UIKit

final class MapPresenter {

    // MARK: - Private properties -

    fileprivate weak var _view: MapViewInterface?
    fileprivate var _interactor: MapInteractorInterface
    fileprivate var _wireframe: MapWireframeInterface
    
    fileprivate var _users: [User] = []

    // MARK: - Lifecycle -

    init(wireframe: MapWireframeInterface, view: MapViewInterface, interactor: MapInteractorInterface) {
        _wireframe = wireframe
        _view = view
        _interactor = interactor
    }

}

// MARK: - Extensions -

extension MapPresenter: MapPresenterInterface {
    
    func viewDidLoad() {
        _interactor.getUsersLocations { [weak self] (result) in
            guard let _self = self else { return }
            switch result {
            case .success(let users):
                _self._users = users
                _self._view?.reloadView(with: users)
            case .failure(let error):
                _self._wireframe.showAlert(with: error.localizedDescription, with: nil)
            }
        }
    }
}
