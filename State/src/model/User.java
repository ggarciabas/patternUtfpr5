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
package model;

import state.State;
import state.StateConnected;
import state.StateDisconnected;

/**
 *  Classe User
 *      Define um usuário.
 * @author Giovanna Garcia
 */
public class User {

    State connected;
    State disconnected;
    State visitor;
    State state = new StateConnected(this);

    public User() {
        connected = new StateConnected(this);
        disconnected = new StateDisconnected(this);
    }
    
    public void visulize () {
        state.visit();
    }
    
    public void connect () {
        state.connect();
    }

    public void disconnect () {
        state.disconnect();        
    }
    
    public State getConnected() {
        return connected;
    }

    public State getDisconnected() {
        return disconnected;
    }

    public State getVisitor() {
        return visitor;
    }

    public void setState(State state) {
        this.state = state;
    }
}
