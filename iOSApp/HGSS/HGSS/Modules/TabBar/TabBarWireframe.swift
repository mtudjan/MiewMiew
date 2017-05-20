//
//  TabBarWireframe.swift
//  HGSS
//
//  Created by Nikola Majcen on 20/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//

import UIKit

final class TabBarWireframe: BaseWireframe {

    // MARK: - Private properties -

    private let _storyboard: UIStoryboard = UIStoryboard(name: "TabBar", bundle: nil)

    fileprivate let mapsNavigationController = UINavigationController()
    fileprivate let messagingNavigationController = UINavigationController()
    
    fileprivate lazy var tabBarWireframes: [BaseWireframe] =  {
        let profile = ProfileWireframe(navigationController: self.messagingNavigationController)
        
        profile.show(with: .root, animated: false)
        
        return [profile]
    }()
    
    // MARK: - Module setup -
    
    func configureModule(with tabBarController: TabBarController) {
        let interactor = TabBarInteractor()
        let presenter = TabBarPresenter(wireframe: self, view: tabBarController, interactor: interactor)
        
        tabBarController.presenter = presenter
        tabBarController.viewControllers = tabBarWireframes.map({ $0.navigationController })
        
        navigationController.setNavigationBarHidden(false, animated: false)
    }
    
    // MARK: - Transitions -
    
    func show(with transition: Transition, animated: Bool = true) {
        let moduleViewController = _storyboard.instantiateViewController(withIdentifier: "TabBarController") as! TabBarController
        configureModule(with: moduleViewController)
        show(moduleViewController, with: transition, animated: animated)
    }
}

// MARK: - Extensions -

extension TabBarWireframe: TabBarWireframeInterface {

    func navigate(to option: TabBarNavigationOption) {
    }

}
