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
package app;

import modelo.Bebida;
import modelo.concrete.Espresso;
import pattern.condimentos.Chantilly;

/**
 * Class Cafeteria
 * 
 * @author Giovanna Garcia
 */
public class Cafeteria {
    public static void main(String[] args) {
        Bebida b = new Espresso();
        //System.out.println("Servindo um "+b.getDescricao()+" com custo "+b.custo());
        b = new Chantilly(b);
        //System.out.println(b.getDescricao()+" custo $"+b.custo());
        System.out.println(b);
    }
}
