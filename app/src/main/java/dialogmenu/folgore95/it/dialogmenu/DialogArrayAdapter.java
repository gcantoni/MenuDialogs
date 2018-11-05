package dialogmenu.folgore95.it.dialogmenu;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * @author Cantoni Giorgio - giorgio.canto98@gmail.com on 31/10/18.
 */

public class DialogArrayAdapter extends ArrayAdapter<String> {

    private int[] images;

    /**
     * First Constructor - used in Simple Dialog, Rounded Dialog and Rounded Colored Dialog Menu
     * NOTE: dialog layout from framework has been override for easily changing backgrounds and texts colors with no issues
     * @param context
     * @param items
     * @param images
     */
    public DialogArrayAdapter(Context context, String[] items, int[] images) {
        super(context, R.layout.dialog, items);
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView textView = view.findViewById(android.R.id.text1);

        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(images[position], 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(images[position], 0, 0, 0);
        }
        textView.setCompoundDrawablePadding(
                (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 12, getContext().getResources().getDisplayMetrics()));
        return view;
    }

}