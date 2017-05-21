//
//  ParticipantsPresenter.swift
//  HGSS
//
//  Created by Nikola Majcen on 21/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//
//  This file was generated by the 🐍 VIPER generator
//

import UIKit

final class ParticipantsPresenter {

    // MARK: - Private properties -

    fileprivate weak var _view: ParticipantsViewInterface?
    fileprivate var _interactor: ParticipantsInteractorInterface
    fileprivate var _wireframe: ParticipantsWireframeInterface
    fileprivate var _actionId: Int?

    fileprivate var _users: [User] = []

    // MARK: - Lifecycle -

    init(wireframe: ParticipantsWireframeInterface, view: ParticipantsViewInterface, interactor: ParticipantsInteractorInterface, actionId: Int?) {
        _wireframe = wireframe
        _view = view
        _interactor = interactor
        _actionId = actionId
    }

}

// MARK: - Extensions -

extension ParticipantsPresenter: ParticipantsPresenterInterface {
    
    func viewDidLoad() {
        _wireframe.showLoading()
        guard let _id = _actionId else { return }
        _interactor.getRescuers(by: _id) { [weak self] (result) in
            guard let _self = self else { return }
            _self._wireframe.hideLoading()
            switch result {
            case .success(let users):
                _self._users = users
                _self._view?.reloadView()
                print(users)
            case .failure(let error):
               _self._wireframe.showAlert(with: error.localizedDescription, with: nil)
            }
        }
    }
    func numberOfItems() -> Int {
        return _users.count
    }
    
    func item(at index: IndexPath) -> User {
        return _users[index.row]
    }
    
    func didSelect(at index: IndexPath) {
        let _userId = _users[index.row].id
        _wireframe.showLoading()
        _interactor.addParticipant(by: _userId, actionId: _actionId!) { [weak self] (result) in
            self?._wireframe.hideLoading()
            switch result {
            case .success(_):
                self?._wireframe.showAlert(with: "Request has been sent.", with: nil)
            case .failure(let error):
                print(error.localizedDescription)
            }
        }
    }

}