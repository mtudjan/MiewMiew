//
//  ParticipantsViewController.swift
//  HGSS
//
//  Created by Nikola Majcen on 21/05/2017.
//  Copyright (c) 2017 Nikola Majcen. All rights reserved.
//
//  This file was generated by the 🐍 VIPER generator
//

import UIKit

final class ParticipantsViewController: UIViewController {

    @IBOutlet weak var participantsTableView: UITableView!
    
     // MARK: - Public properties -

     var presenter: ParticipantsPresenterInterface!

     // MARK: - Lifecycle -

     override func viewDidLoad() {
         super.viewDidLoad()
        presenter.viewDidLoad()
        
        title = "Selection"
        
        participantsTableView.delegate = self
        participantsTableView.dataSource = self
     }

}

// MARK: - Extensions -

extension ParticipantsViewController: ParticipantsViewInterface {
    
    func reloadView() {
        participantsTableView.reloadData()
    }
}

extension ParticipantsViewController: UITableViewDelegate, UITableViewDataSource {
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return presenter.numberOfItems()
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "ParticipantsTableViewCell", for: indexPath) as! ParticipantsTableViewCell
        cell.configure(with: presenter.item(at: indexPath), delegate: self)
        return cell
    }
    
    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        presenter.didSelect(at: indexPath)
    }
}

extension ParticipantsViewController: ParticipantDelegate {
    
    func didSelected(cell: UITableViewCell) {
        if let index = participantsTableView.indexPath(for: cell) {
            presenter.didSelect(at: index)
        }
    }
}

