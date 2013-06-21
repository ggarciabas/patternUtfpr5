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
 * Class State Connected
 *      Estado concreto.
 * @author Giovanna Garcia
 */
public class StateConnected implements State{

    User user;

    public StateConnected(User user) {
        this.user = user;
    }    
    
    @Override
    public void connect() {
        System.out.println("Error: You are already connected!!");
    }

    @Override
    public void disconnect() {
        System.out.println("Good-bye! See you later.");
        user.setState(user.getDisconnected());
    }

    @Override
    public void visit() {
        System.out.println("Watching the news.");
    }
    
}
