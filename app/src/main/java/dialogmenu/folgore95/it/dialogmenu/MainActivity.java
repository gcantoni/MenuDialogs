package dialogmenu.folgore95.it.dialogmenu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.Arrays;

/**
 * @author Cantoni Giorgio - giorgio.canto98@gmail.com on 31/10/18.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Simple Dialog Menu
     */
    public void simpleDialog(View view) {
        final int style = R.style.AppTheme_Dialog_Simple;

        ListAdapter adapter = new DialogArrayAdapter(this, getDialogStrings(), getDialogIcons(), style);

        // AlertDialog with some options
        new AlertDialog.Builder(this)
                .setTitle(getString(R.string.menu)) // title
                .setIcon(R.mipmap.ic_launcher) // icon
                .setCancelable(true)
                .setAdapter(adapter, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // menu options
                        switch (which) {
                            /*
                             * Option 0 - do something
                             */
                            case 0:
                                doSomething();
                                break;
                            /*
                             * Option 1 - do something
                             */
                            case 1:
                                doSomething();
                                break;
                            /*
                             * Option 2 - do something
                             */
                            case 2:
                                doSomething();
                                break;
                            /*
                             * Option 3 - do something
                             */
                            case 3:
                                doSomething();
                                break;
                        }
                    }
                }).show();
    }

    /**
     * Rounded Dialog Menu
     */
    public void roundedDialog(View view) {
        final int style = R.style.AppTheme_Dialog_Rounded;

        ListAdapter adapter = new DialogArrayAdapter(this, getDialogStrings(), getDialogIcons(), style);

        new AlertDialog.Builder(this, style)
                .setAdapter(adapter, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // menu options
                        switch (which) {
                            /*
                             * Option 0 - do something
                             */
                            case 0:
                                doSomething();
                                break;
                            /*
                             * Option 1 - do something
                             */
                            case 1:
                                doSomething();
                                break;
                            /*
                             * Option 2 - do something
                             */
                            case 2:
                                doSomething();
                                break;
                            /*
                             * Option 3 - do something
                             */
                            case 3:
                                doSomething();
                                break;
                        }
                    }
                }).show();
    }

    /**
     * Rounded Colored Dialog Menu
     */
    public void roundedColoredDialog(View view) {
        final int style = R.style.AppTheme_Dialog_Rounded_Colored;

        ListAdapter adapter = new DialogArrayAdapter(this, getDialogStrings(), getDialogIcons(), style);

        // NOTE: we are passing a style to the costructor of the dialog
        new AlertDialog.Builder(this, style)
                .setAdapter(adapter, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // menu options
                        switch (which) {
                            /*
                             * Option 0 - do something
                             */
                            case 0:
                                doSomething();
                                break;
                            /*
                             * Option 1 - do something
                             */
                            case 1:
                                doSomething();
                                break;
                            /*
                             * Option 2 - do something
                             */
                            case 2:
                                doSomething();
                                break;
                            /*
                             * Option 3 - do something
                             */
                            case 3:
                                doSomething();
                                break;
                        }
                    }
                }).show();
    }

    /**
     * Rounded Black Colored Dialog Menu
     */
    public void roundedBlackColoredDialog(View view) {
        final int style = R.style.AppTheme_Dialog_Rounded_Colored_Dark;

        ListAdapter adapter = new DialogArrayAdapter(this, getDialogStrings(), getDialogIcons(), style);

        new AlertDialog.Builder(this, style)
                .setAdapter(adapter, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // menu options
                        switch (which) {
                            /*
                             * Option 0 - do something
                             */
                            case 0:
                                doSomething();
                                break;
                            /*
                             * Option 1 - do something
                             */
                            case 1:
                                doSomething();
                                break;
                            /*
                             * Option 2 - do something
                             */
                            case 2:
                                doSomething();
                                break;
                            /*
                             * Option 3 - do something
                             */
                            case 3:
                                doSomething();
                                break;
                        }
                    }
                }).show();
    }

    private void doSomething() {
        Toast.makeText(this, getString(R.string.example), Toast.LENGTH_SHORT).show();
    }

    /**
     * Github Repo
     */
    public void sourceCode(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/gcantoni/MenuDialogs"));
        startActivity(browserIntent);
    }

    private String[] getDialogStrings() {
        return new String[]{
                getString(R.string.menu0),
                getString(R.string.menu1),
                getString(R.string.menu2),
                getString(R.string.menu3)
        };
    }

    private int[] getDialogIcons() {
        int[] icons = new int[4];
        Arrays.fill(icons, R.drawable.ic_menuicon);
        return icons;
    }

}
