/*
 * BevelBorderCoder.java
 *
 * Created on 2007-9-16, 23:50:42
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dyno.swing.designer.properties.wrappers.borders;

import dyno.swing.designer.properties.items.BevelBorderTypeItems;
import dyno.swing.designer.properties.wrappers.ColorWrapper;
import dyno.swing.designer.properties.wrappers.ItemWrapper;
import dyno.swing.designer.properties.wrappers.SourceCoder;
import java.awt.Color;
import javax.swing.border.BevelBorder;

/**
 *
 * @author William Chen
 */
public class BevelBorderCoder implements SourceCoder {
    private static SourceCoder coder=new ItemWrapper(new BevelBorderTypeItems());
    private static SourceCoder color_coder = new ColorWrapper();
    @Override
    public String getJavaCode(Object value) {
        BevelBorder bevelBorder = (BevelBorder) value;
        int bevelType = bevelBorder.getBevelType();
        Color highlightInnerColor=bevelBorder.getHighlightInnerColor();
        Color highlightOuterColor=bevelBorder.getHighlightOuterColor();
        Color shadowInnerColor=bevelBorder.getShadowInnerColor();
        Color shadowOuterColor=bevelBorder.getShadowOuterColor();
        if(highlightInnerColor == null &&
                highlightOuterColor == null &&
                shadowInnerColor == null &&
                shadowOuterColor == null)
        return "javax.swing.BorderFactory.createBevelBorder(" + coder.getJavaCode(bevelType) + ")";
        else if(highlightOuterColor.equals(highlightInnerColor.brighter()) &&
                shadowOuterColor.brighter().equals(shadowInnerColor)){
            return "javax.swing.BorderFactory.createBevelBorder("+coder.getJavaCode(bevelType)+", "+
                    color_coder.getJavaCode(highlightInnerColor)+", "+
                    color_coder.getJavaCode(shadowOuterColor)+")";
        }else{
            return "javax.swing.BorderFactory.createBevelBorder("+coder.getJavaCode(bevelType)+", "+
                    color_coder.getJavaCode(highlightOuterColor)+", "+
                    color_coder.getJavaCode(highlightInnerColor)+", "+
                    color_coder.getJavaCode(shadowOuterColor)+", "+
                    color_coder.getJavaCode(shadowInnerColor)+")";
        }
    }    
}