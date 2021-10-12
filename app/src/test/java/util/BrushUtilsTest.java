package util;

import org.junit.Test;

import java.util.ArrayList;

import androidmarket.R;
import com.androidmarket.pdfcreator.pdfModel.BrushItem;
import com.androidmarket.pdfcreator.util.BrushUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BrushUtilsTest {

    @Test
    public void when_CallingGetBrushItems_Expect_CorrectBrushItemsReturned() {
        ArrayList<BrushItem> brushItems = BrushUtils.getInstance().getBrushItems();
        assertEquals(9, brushItems.size());

        assertTrue(brushItems.contains(new BrushItem(R.color.mb_blue)));
        assertTrue(brushItems.contains(new BrushItem(R.color.red)));
        assertTrue(brushItems.contains(new BrushItem(R.color.mb_white)));
        assertTrue(brushItems.contains(new BrushItem(R.color.mb_green)));
        assertTrue(brushItems.contains(new BrushItem(R.color.colorPrimary)));
        assertTrue(brushItems.contains(new BrushItem(R.color.colorAccent)));
        assertTrue(brushItems.contains(new BrushItem(R.color.light_gray)));
        assertTrue(brushItems.contains(new BrushItem(R.color.black)));
        assertTrue(brushItems.contains(new BrushItem(R.drawable.color_palette)));
    }

}
