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
     * @param view
     */
    public void simpleDialog(View view) {
        // images and texts for the menu
        final String[] items = { getString(R.string.menu0), getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3)};
        final int[] icons = new int[]{R.drawable.ic_menuicon, R.drawable.ic_menuicon, R.drawable.ic_menuicon, R.drawable.ic_menuicon};

        // we are calling DialogArrayAdapter constructor
        ListAdapter adapter = new DialogArrayAdapter(getApplicationContext(), items, icons);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // options
        builder.setTitle(getString(R.string.menu)); // title
        builder.setIcon(R.mipmap.ic_launcher); // icon
        builder.setCancelable(true);

        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // menu options
                switch (which) {
                    /*
                     * Option 0 - do something
                     */
                    case 0:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 1 - do something
                     */
                    case 1:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 2 - do something
                     */
                    case 2:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 3 - do something
                     */
                    case 3:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        builder.create().show();
    }

    /**
     * Rounded Dialog Menu
     * @param view
     */
    public void roundedDialog(View view) {
        // images and texts for the menu
        final String[] items = { getString(R.string.menu0), getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3)};
        final int[] icons = new int[]{R.drawable.ic_menuicon, R.drawable.ic_menuicon, R.drawable.ic_menuicon, R.drawable.ic_menuicon};

        // we are calling DialogArrayAdapter constructor
        ListAdapter adapter = new DialogArrayAdapter(getApplicationContext(), items, icons);

        // NOTE: we are passing a style to the costructor of the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.RoundedDialog );

        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // menu options
                switch (which) {
                    /*
                     * Option 0 - do something
                     */
                    case 0:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 1 - do something
                     */
                    case 1:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 2 - do something
                     */
                    case 2:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 3 - do something
                     */
                    case 3:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        builder.create().show();
    }

    /**
     * Rounded Colored Dialog Menu
     * @param view
     */
    public void roundedColoredDialog(View view) {
        // images and texts for the menu
        final String[] items = { getString(R.string.menu0), getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3)};
        final int[] icons = new int[]{R.drawable.ic_menuiconcolored, R.drawable.ic_menuiconcolored, R.drawable.ic_menuiconcolored, R.drawable.ic_menuiconcolored};

        // we are calling DialogArrayAdapter constructor
        ListAdapter adapter = new DialogArrayAdapter(getApplicationContext(), items, icons);

        // NOTE: we are passing a style to the costructor of the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.RoundedColoredDialog );

        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // menu options
                switch (which) {
                    /*
                     * Option 0 - do something
                     */
                    case 0:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 1 - do something
                     */
                    case 1:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 2 - do something
                     */
                    case 2:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 3 - do something
                     */
                    case 3:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        builder.create().show();
    }

    /**
     * Rounded Black Colored Dialog Menu
     * @param view
     */
    public void roundedBlackColoredDialog(View view) {
        // images and texts for the menu
        final String[] items = { getString(R.string.menu0), getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3)};
        final int[] icons = new int[]{R.drawable.ic_menuiconcolored, R.drawable.ic_menuiconcolored, R.drawable.ic_menuiconcolored, R.drawable.ic_menuiconcolored};

        // we are calling DialogArrayAdapter second constructor
        ListAdapter adapter = new DialogArrayAdapter(getApplicationContext(), R.layout.dialogblack,items, icons);

        // NOTE: we are passing a style to the costructor of the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.RoundedBlackColoredDialog );

        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // menu options
                switch (which) {
                    /*
                     * Option 0 - do something
                     */
                    case 0:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 1 - do something
                     */
                    case 1:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 2 - do something
                     */
                    case 2:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                    /*
                     * Option 3 - do something
                     */
                    case 3:
                        Toast.makeText(MainActivity.this, getString(R.string.example), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        builder.create().show();
    }

    /**
     * Github Repo
     * @param view
     */
    public void sourceCode(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/gcantoni/MenuDialogs"));
        startActivity(browserIntent);
    }

}
