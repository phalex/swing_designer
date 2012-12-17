
/*
 * EmptyBorderAdapter.java
 * 
 * Created on 2007-8-27, 17:53:05
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dyno.swing.designer.beans.adapters.borders;

import dyno.swing.designer.beans.BorderAdapter;
import dyno.swing.designer.beans.BorderGroupModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author William Chen
 */
public class LineBorderAdapter implements BorderAdapter {
    protected LineBorder border;
    public LineBorderAdapter(Border b){
        border=(LineBorder)b;
    }
    public BorderGroupModel getBorderProperties() {
        return new LineBorderModel(border);
    }
}
