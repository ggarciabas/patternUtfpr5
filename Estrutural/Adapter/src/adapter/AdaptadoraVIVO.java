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
package adapter;

import control.EnviarVIVO;
import model.Sms;

/**
 * Class AdaptarVIVO
 *  
 * @author Giovanna Garcia
 */
public class AdaptadoraVIVO implements Adapter {

    private EnviarVIVO ev = new EnviarVIVO();
    
    @Override
    public void enviarMensagem(Sms sms) {
        ev.enviarMensagem(sms.getTexto(), sms.getDestinatario(), sms.getRemetente());
    }   
    
}
