//
//  ActionsPresenter.swift
//  HGSS
//
//  Created by Nikola Majcen on 20/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//
//  This file was generated by the 🐍 VIPER generator
//

import UIKit

final class ActionsPresenter {

    // MARK: - Private properties -

    fileprivate weak var _view: ActionsViewInterface?
    fileprivate var _interactor: ActionsInteractorInterface
    fileprivate var _wireframe: ActionsWireframeInterface
    
    fileprivate var _actions: [RescueAction] = []

    // MARK: - Lifecycle -

    init(wireframe: ActionsWireframeInterface, view: ActionsViewInterface, interactor: ActionsInteractorInterface) {
        _wireframe = wireframe
        _view = view
        _interactor = interactor
    }
    
    fileprivate func _checkUser() {
        if UserDefaults.standard.value(forKey: Constants.UserDefaults.userToken) == nil {
            _wireframe.navigate(to: .login)
        }
    }
}

// MARK: - Extensions -

extension ActionsPresenter: ActionsPresenterInterface {
    
    func viewDidLoad() {
        _checkUser()
    }
    
    func viewWillAppear(animated: Bool) {
        _wireframe.showLoading()
        _interactor.getActions { [weak self] (result) in
            guard let _self = self else { return }
            _self._wireframe.hideLoading()
            switch result {
            case .success(let actions):
                _self._actions = actions
                _self._view?.reloadView()
            case .failure(let error):
                _self._wireframe.showAlert(with: error.localizedDescription, with: nil)
            }
        }
    }
    
    func numberOfActionItems() -> Int {
        return _actions.count
    }
    
    func action(for indexPath: IndexPath) -> RescueAction {
        return _actions[indexPath.row]
    }
    
    func didSelectRescueAction(at indexPath: IndexPath) {
        _wireframe.navigate(to: .details(_actions[indexPath.row]))
    }
    
    func didSelectAddAction() {
        _wireframe.navigate(to: .addAction(action: nil, delegate: self))
    }
}

extension ActionsPresenter: RescueActionDelegate {
    
    func didCreateAction() {
        
    }
    
    func didEditAction(_ action: RescueAction) {
        
    }
}
