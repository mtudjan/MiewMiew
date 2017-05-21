//
//  ParticipantsInterfaces.swift
//  HGSS
//
//  Created by Nikola Majcen on 21/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//
//  This file was generated by the 🐍 VIPER generator
//

import UIKit

enum ParticipantsNavigationOption {
}

protocol ParticipantsWireframeInterface: WireframeInterface {
    func navigate(to option: ParticipantsNavigationOption)
}

protocol ParticipantsViewInterface: ViewInterface {
    func reloadView()
}

protocol ParticipantsPresenterInterface: PresenterInterface {
    func numberOfItems() -> Int
    func item(at index: IndexPath) -> User
    func didSelect(at index: IndexPath)
}

protocol ParticipantsInteractorInterface: InteractorInterface {
    func getRescuers(by actionId: Int, completion: @escaping (Result<[User]>) -> Void)
    func addParticipant(by userId: String?, actionId: Int?, completion: @escaping (Result<Bool>) -> Void)
}