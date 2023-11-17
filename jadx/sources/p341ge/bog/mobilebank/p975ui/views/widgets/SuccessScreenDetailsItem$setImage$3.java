package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.bumptech.glide.load.engine.GlideException;
import p035c4.C2255g;
import p050d4.C5825i;
import p166m3.C7079a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SuccessScreenDetailsItem$setImage$3 */
public final class SuccessScreenDetailsItem$setImage$3 implements C2255g {
    final /* synthetic */ Integer $imageHeight;
    final /* synthetic */ Integer $imageWidth;
    final /* synthetic */ int $position;
    final /* synthetic */ TextView $value;
    final /* synthetic */ SuccessScreenDetailsItem this$0;

    SuccessScreenDetailsItem$setImage$3(SuccessScreenDetailsItem successScreenDetailsItem, int i, TextView textView, Integer num, Integer num2) {
        this.this$0 = successScreenDetailsItem;
        this.$position = i;
        this.$value = textView;
        this.$imageWidth = num;
        this.$imageHeight = num2;
    }

    public boolean onLoadFailed(GlideException glideException, Object obj, C5825i iVar, boolean z) {
        return false;
    }

    public boolean onResourceReady(Drawable drawable, Object obj, C5825i iVar, C7079a aVar, boolean z) {
        if (drawable == null) {
            return false;
        }
        this.this$0.transformDrawable(drawable, this.$position, this.$value, this.$imageWidth, this.$imageHeight);
        return false;
    }
}
