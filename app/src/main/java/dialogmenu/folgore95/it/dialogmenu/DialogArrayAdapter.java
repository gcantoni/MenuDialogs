package dialogmenu.folgore95.it.dialogmenu;

import android.content.Context;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
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
     * @param context The current context
     * @param items Array of strings representing the list items
     * @param images Array of drawables res IDs for the images in the list
     * @throws IllegalArgumentException If the length of string items and image drawables is not the same
     */
    public DialogArrayAdapter(Context context, String[] items, @DrawableRes int[] images) {
        super(context, R.layout.dialog, items);
        if (items.length != images.length) {
            throw new IllegalArgumentException("Length of string items and drawables must be the same");
        }
        this.images = images;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
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