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

import java.util.ArrayList;
import observer.Observer;
import observer.Subject;

/**
 *  Classe Editora
 *      Classe concreta de Subject.
 * @author Giovanna Garcia
 */
public class Editora implements Subject {

    // controle das informacoes
    private ArrayList<Observer> observadores;
    // atributos notícia: sera feita a notificacao
    private String noticia;

    public Editora() {
        this.observadores = new ArrayList<>();
    }   

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
        this.notificarTodos(); // notifica a todos a nova notícia
    }        
    
    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarTodos() {
        for (Observer observer : observadores) {
            observer.atualizar(noticia);
        }
    }
    
}
