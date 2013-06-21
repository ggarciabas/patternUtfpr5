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
package observer.concrete;

import observer.Observer;

/**
 * Classe Assiante
 *      Classe concreta de um observador.
 * 
 * @author Giovanna Garcia
 */
public class Assinante implements Observer{

    @Override
    public void atualizar(String noticia) {
        System.out.println(noticia);
    }
    
}
