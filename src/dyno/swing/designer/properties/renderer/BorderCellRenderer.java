/*
 * BorderCellRenderer.java
 *
 * Created on August 14, 2007, 7:01 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package dyno.swing.designer.properties.renderer;

import dyno.swing.designer.properties.wrappers.BorderWrapper;


/**
 *
 * @author William Chen
 */
public class BorderCellRenderer extends EncoderCellRenderer {
    /** Creates a new instance of PointCellRenderer */
    public BorderCellRenderer() {
        super(new BorderWrapper());
    }
}
