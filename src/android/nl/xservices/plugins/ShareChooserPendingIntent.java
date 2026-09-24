package nl.xservices.plugins;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class ShareChooserPendingIntent extends BroadcastReceiver {
    public static String chosenComponent = null;
    @Override
    public void onReceive(Context context, Intent intent) {
        final ComponentName component = intent.getParcelableExtra(Intent.EXTRA_CHOSEN_COMPONENT);
        if (component != null) {
            // "pkg/cls", not toString()'s "ComponentInfo{pkg/cls}"
            ShareChooserPendingIntent.chosenComponent = component.flattenToString();
        }
    }
}
