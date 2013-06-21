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

/**
 * Class Dinheiro
 *  Fornecer um substituto para controlar o acesso.
 * 
 *  Proxy class
 * 
 * @author Giovanna Garcia
 */
public class Dinheiro {
    private float valor = 100; 
    
    public void gastarDinheiro (float f) {
        System.out.println("Você acaba de gastar teu dinheiro..");
        valor -= f;
    }
    
    public void verificarSaldo () {
        System.out.println("Você ainda tem $" + valor + " restantes.");
    }
    
}
