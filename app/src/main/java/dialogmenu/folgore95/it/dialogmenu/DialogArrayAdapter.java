package dialogmenu.folgore95.it.dialogmenu;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

/**
 * @author Cantoni Giorgio - giorgio.canto98@gmail.com on 31/10/18.
 */

public class DialogArrayAdapter extends ArrayAdapter<String> {

    public List<Integer> images;

    /**
     * First Constructor - used in Simple Dialog, Rounded Dialog and Rounded Colored Dialog Menu
     * NOTE: dialog layout from framework has been override for easily changing backgrounds and texts colors with no issues
     * @param context
     * @param items
     * @param images
     */
    public DialogArrayAdapter(Context context, String[] items, Integer[] images) {
        super(context, R.layout.dialog, items);
        this.images = Arrays.asList(images);
    }

    /**
     * Second Constructor - used in Rounded Black Colored Dialog Menu
     * It has a difference signature and a changed layout from the other constructor
     * @param context
     * @param layout
     * @param items
     * @param images
     */
    public DialogArrayAdapter(Context context, int layout, String[] items, Integer[] images) {
        super(context,R.layout.dialogblack, items);
        this.images = Arrays.asList(images);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);

        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(images.get(position), 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(images.get(position), 0, 0, 0);
        }
        textView.setCompoundDrawablePadding(
                (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 12, getContext().getResources().getDisplayMetrics()));
        return view;
    }

}