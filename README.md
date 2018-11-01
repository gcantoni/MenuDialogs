<h1 align="center">Menu Dialogs <img src="https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat"></h1>
<h4 align="center">Android Demo</h4>
<p align="center">Customize your Android apps dialogs easily!</p>
<h3 align="center"><img src="https://raw.githubusercontent.com/gcantoni/MenuDialogs/master/images/app0.png"/></h3>
<i><p align="center">
  Author: <a target="_blank" href="https://github.com/gcantoni">Giorgio Cantoni</a><br>
  Dialogs Resources: <a target="_blank" href="https://github.com/djdarkknight96">Bryan Owens</a><br>
  
</p></i>

## Download Sample
 [<img src="https://raw.githubusercontent.com/gcantoni/MenuDialogs/master/images/google-play-badge.png" alt="Get it on Google Play" height="60">](https://play.google.com/store/apps/details?id=dialogmenu.folgore95.it.dialogmenu)[<img src="https://raw.githubusercontent.com/gcantoni/MenuDialogs/master/images/github.png" alt="Download APK from GitHub" height="60">](https://github.com/gcantoni/menudialogs/releases)

## Custom dialogs available
- Simple Dialog Menu
- Rounded Dialog Menu
- Rounded Colored Dialog Menu (Borders)
- Rounded Colored Dialog Menu (Borders and background)

## Simple Dialog Menu
<img src="https://raw.githubusercontent.com/gcantoni/MenuDialogs/master/images/app1.png"/>

- First, create your dialog menu items and icons like it has been done <a href="https://github.com/gcantoni/MenuDialogs/blob/master/app/src/main/java/dialogmenu/folgore95/it/dialogmenu/MainActivity.java#L31">here.</a>

```
final String[] items = { string, string, string, string, ...};
final Integer[] icons = new Integer[] {icon, icon, icon, icon, ...};

// You can add how much texts and icons you want but you need to consider your users phones dpi
```
- Create a new **ListAdapter**
```
ListAdapter adapter = new DialogArrayAdapter(getApplicationContext(), items, icons);
```
- Create a new class `DialogArrayAdapter` like <a href="https://github.com/gcantoni/MenuDialogs/blob/master/app/src/main/java/dialogmenu/folgore95/it/dialogmenu/DialogArrayAdapter.java">this one.</a><br> Notice that this class extends ArrayAdapter class and in his constructor there is passed an Android framework layout. If you are planning to play with your dialog colors like the background, we need to redefine this layout or the text of the various options will be broken. For preventing that, we have overwritten the ArrayAdapter constructor layout with <a href="https://github.com/gcantoni/MenuDialogs/blob/master/app/src/main/res/layout/dialog.xml">a new one</a> available under our app resources.
```
public DialogArrayAdapter(Context context, String[] items, Integer[] images) {
        super(context, R.layout.dialog, items); // dialog is the layout interested
        this.images = Arrays.asList(images);
    }
```
- In your principal class build a Dialog using **AlertDialog**
```
AlertDialog.Builder builder = new AlertDialog.Builder(this);
```

- If you want add options ( methods from AlertDialog)
```
builder.setTitle(string); // title
builder.setIcon(icon); // icon
builder.setCancelable(true);

// options
``` 

- Now create the dialog interface
```
builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                                                                   }
                                                                   }
```

- Inside onClick method create a switch with all of your options like it has been done <a href="https://github.com/gcantoni/MenuDialogs/blob/master/app/src/main/java/dialogmenu/folgore95/it/dialogmenu/MainActivity.java#L44">here.</a>
```
switch (which) {
                    case 0:
                        // Action
                        break;
                    
                    case 1:
                        // Action
                        break;
                    
                    case 2:
                        // Action
                        break;
                        
                    case 3:
                        // Action
                        break;
                }
                
// Menu options: they must follow the numbers of your icons and strings declared at the start as constants
```
## Rounded Dialog Menu
<img src="https://raw.githubusercontent.com/gcantoni/MenuDialogs/master/images/app2.png"/>
