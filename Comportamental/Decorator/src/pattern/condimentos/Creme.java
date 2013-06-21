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
package pattern.condimentos;

import modelo.Bebida;
import pattern.Decorator;

/**
 * Classe Creme
 * 
 * @author Giovanna Garcia
 */
public class Creme extends Decorator{

    private Bebida b;

    public Creme(Bebida b) {
        this.b = b;
    }
    
    @Override
    public String getDescricao() {
        return "Servindo um " + b.getDescricao() + " com Creme";
    }

    @Override
    public double custo() {
        return b.custo() + 0.82;
    }
    
}
