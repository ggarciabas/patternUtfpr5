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

/**
 * Padrão de projeto - voltado a controlar diferentes estados dentro da
 * aplicação. Um usuario pode acessar uma aplicacao, pode esta autenticado
 * (online), nao estar autenticado (offline) ou ser um visitante.
 *
 * @author Giovanna Garcia
 */
public interface State {
    // operacoes que um usuário pode fazer
    public void connect();
    public void disconnect();
    public void visit();
    
}
