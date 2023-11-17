package oa1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.content.C0781h;
import androidx.fragment.app.Fragment;
import gb1.C32366c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: oa1.a */
public abstract class C26917a {
    /* renamed from: a */
    public static final File m83683a(Context context) {
        C41536l.m120489i(context, "context");
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        C41536l.m120488h(format, "SimpleDateFormat(\"yyyyMMdd_HHmmss\").format(Date())");
        File externalCacheDir = context.getExternalCacheDir();
        C41536l.m120486f(externalCacheDir);
        File createTempFile = File.createTempFile("JPEG_" + format + '_', ".jpg", externalCacheDir);
        C41536l.m120488h(createTempFile, "createTempFile(\n        …Dir /* directory */\n    )");
        return createTempFile;
    }

    /* renamed from: b */
    private static final Intent m83684b(File file, Context context) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            C41536l.m120488h(resolveActivity, "resolveActivity(context.packageManager)");
            Uri f = C0781h.m2933f(context, context.getPackageName() + ".sso_client_provider", file);
            C41536l.m120488h(f, "getUriForFile(\n         …     it\n                )");
            intent.putExtra("output", f);
        }
        return intent;
    }

    /* renamed from: c */
    private static final Intent m83685c(Context context, File file) {
        return m83684b(file, context);
    }

    /* renamed from: d */
    public static final Uri m83686d(Fragment fragment, C32366c cVar) {
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(cVar, "helper");
        if (cVar.mo72865b(fragment, 319, "android.permission.CAMERA")) {
            return null;
        }
        Context requireContext = fragment.requireContext();
        C41536l.m120488h(requireContext, "fragment.requireContext()");
        File a = m83683a(requireContext);
        m83687e(fragment, a);
        return Uri.fromFile(a);
    }

    /* renamed from: e */
    private static final void m83687e(Fragment fragment, File file) {
        Context requireContext = fragment.requireContext();
        C41536l.m120488h(requireContext, "fragment.requireContext()");
        try {
            fragment.startActivityForResult(m83685c(requireContext, file), 287);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: f */
    public static final void m83688f(Fragment fragment) {
        C41536l.m120489i(fragment, "fragment");
        fragment.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), BogInputLayout.INPUT_TYPE_NUM_DIGIT);
    }
}
