package p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.decoder.ImageRegionDecoder */
public interface ImageRegionDecoder {
    Bitmap decodeRegion(Rect rect, int i);

    Point init(Context context, Uri uri);

    boolean isReady();

    void recycle();
}
