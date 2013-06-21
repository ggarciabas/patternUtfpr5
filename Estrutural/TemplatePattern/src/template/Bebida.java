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
package template;

/**
 * Abstract Class Bebida
 *
 * @author Giovanna Garcia
 */
public abstract class Bebida {

    
    public final void prepararBebida() {
        ferverAgua();
        realizarInfusao();
        adicionarCondimentos(); // responsabilidade da subclasse
        servirBebida();
    }

    public void ferverAgua() {
        System.out.println("Fervendo a água para ser aadicionada.");
    }

    public void servirBebida() {
        System.out.println("Servindo bebida preparada em uma xícara.");
    }

    public abstract void realizarInfusao(); // a subclasse define se adiciona CHA ou CAFE
    public abstract void adicionarCondimentos(); // qual condimento esta sendo adicionado : açucar, limao, leite...
}
