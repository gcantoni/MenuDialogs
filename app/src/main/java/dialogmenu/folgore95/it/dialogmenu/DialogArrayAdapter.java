package dialogmenu.folgore95.it.dialogmenu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v7.view.ContextThemeWrapper;
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
    private int compoundDrawableColor;
    private int compoundDrawablePadding;

    /**
     * Dialog layout from framework has been override for easily changing backgrounds and texts colors with no issues
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

        // Get compound drawable color from style attributes
        TypedValue typedColor = new TypedValue();
        boolean attrFound = getContext().getTheme().resolveAttribute(R.attr.dialogCompoundIconColor, typedColor, true);
        if (attrFound) {
            this.compoundDrawableColor = typedColor.data;
        } else {
            this.compoundDrawableColor = Color.BLACK;
        }

        // Get compound drawable padding
        this.compoundDrawablePadding = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                12,
                context.getResources().getDisplayMetrics()
        );
    }

    /**
     * Apply a custom style to the items of the list and call the primary constructor
     *
     * @param style Custom style to apply
     */
    public DialogArrayAdapter(Context context, String[] items, @DrawableRes int[] images, @StyleRes int style) {
        this(new ContextThemeWrapper(context, style), items, images);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView textView = view.findViewById(android.R.id.text1);

        // Get the compound drawable
        Drawable compoundDrawable = getContext().getResources().getDrawable(images[position]).mutate();
        compoundDrawable.setColorFilter(compoundDrawableColor, PorterDuff.Mode.SRC_ATOP);

        // Set the tinted drawable
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawable, null, null, null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawable, null, null, null);
        }

        textView.setCompoundDrawablePadding(compoundDrawablePadding);
        return view;
    }

}