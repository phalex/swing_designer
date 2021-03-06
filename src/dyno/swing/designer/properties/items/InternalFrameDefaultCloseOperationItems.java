/*
 * HorizontalAlignmentWrapper.java
 *
 * Created on 2007-8-19, 16:48:45
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dyno.swing.designer.properties.items;

import dyno.swing.designer.properties.wrappers.*;
import dyno.swing.designer.properties.types.Item;
import javax.swing.WindowConstants;

/**
 *
 * @author William Chen
 */
public class InternalFrameDefaultCloseOperationItems implements ItemProvider {

    private Item[] VALUE_ITEMS = {
        new Item("DO_NOTHING", WindowConstants.DO_NOTHING_ON_CLOSE, "javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE"), 
        new Item("HIDE", WindowConstants.HIDE_ON_CLOSE, "javax.swing.WindowConstants.HIDE_ON_CLOSE"), 
        new Item("DISPOSE", WindowConstants.DISPOSE_ON_CLOSE, "javax.swing.WindowConstants.DISPOSE_ON_CLOSE")
    };

    public InternalFrameDefaultCloseOperationItems() {
    }

    @Override
    public Item[] getItems() {
        return VALUE_ITEMS;
    }
}