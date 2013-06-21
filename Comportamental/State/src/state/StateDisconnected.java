/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation;
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package state;

import model.User;

/**
 *  Class State Disconnected
 *      Estado concreto.
 * @author Giovanna Garcia
 */
public class StateDisconnected implements State{

    User user;

    public StateDisconnected(User user) {
        this.user = user;
    }
    
    @Override
    public void connect() {
        System.out.println("Welcome to the Jungle!!! =D");
        user.setState(user.getConnected());
    }

    @Override
    public void disconnect() {
        System.out.println("Error: OMG!! You are already disconnected.");
    }

    @Override
    public void visit() {
        System.out.println("Error: What do you want? You are disconnected SHIT!!");
    }
    
}
