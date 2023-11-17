package p341ge.bog.designsystem.components.gyroanimation;

import android.content.Context;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.C1152f3;
import com.bumptech.glide.C2394j;
import com.github.mikephil.charting.utils.Utils;
import he1.C41224m;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435gi.C15279a;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.gyroanimation.GyroAnimationView */
public final class GyroAnimationView extends FrameLayout {

    /* renamed from: d */
    private final List f39530d;

    /* renamed from: e */
    private C41224m f39531e;

    /* renamed from: ge.bog.designsystem.components.gyroanimation.GyroAnimationView$a */
    static final class C13335a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13335a f39532d = new C13335a();

        C13335a() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$null");
            return jVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GyroAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final float m50183b(float f, float f2) {
        float f3 = f - f2;
        boolean z = f3 < Utils.FLOAT_EPSILON;
        float min = ((float) ((int) (Math.min(Math.abs(f3), 1.0f) * ((float) 100)))) / 100.0f;
        return z ? -min : min;
    }

    /* renamed from: c */
    private final C41224m m50184c(float[] fArr) {
        float[] fArr2 = new float[16];
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] fArr3 = new float[16];
        SensorManager.remapCoordinateSystem(fArr2, 2, 129, fArr3);
        float[] fArr4 = new float[3];
        SensorManager.getOrientation(fArr3, fArr4);
        return C41233s.m119492a(Float.valueOf(fArr4[1]), Float.valueOf(fArr4[2]));
    }

    /* renamed from: e */
    public static /* synthetic */ void m50185e(GyroAnimationView gyroAnimationView, List list, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = C13335a.f39532d;
        }
        gyroAnimationView.mo35781d(list, lVar);
    }

    /* renamed from: a */
    public final void mo35780a(C15279a aVar) {
        float f;
        float f2;
        C41536l.m120489i(aVar, "orientationData");
        if (this.f39531e == null) {
            this.f39531e = m50184c(aVar.mo42361b());
            return;
        }
        C41224m c = m50184c(aVar.mo42360a());
        float floatValue = ((Number) c.mo95678e()).floatValue();
        float floatValue2 = ((Number) c.mo95680f()).floatValue();
        C41224m mVar = this.f39531e;
        C41224m mVar2 = null;
        if (mVar == null) {
            C41536l.m120506z("startOrientation");
            mVar = null;
        }
        float b = m50183b(floatValue, ((Number) mVar.mo95678e()).floatValue());
        C41224m mVar3 = this.f39531e;
        if (mVar3 == null) {
            C41536l.m120506z("startOrientation");
        } else {
            mVar2 = mVar3;
        }
        float b2 = m50183b(floatValue2, ((Number) mVar2.mo95680f()).floatValue());
        int i = 0;
        for (Object next : C1152f3.m4215b(this)) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            View view = (View) next;
            GyroAnimationFrame gyroAnimationFrame = (GyroAnimationFrame) this.f39530d.get(i);
            if (b < Utils.FLOAT_EPSILON) {
                f = ((float) gyroAnimationFrame.mo35770e()) * Math.abs(b);
            } else {
                f = ((float) gyroAnimationFrame.mo35767b()) * b;
            }
            view.setTranslationX(f);
            if (b2 < Utils.FLOAT_EPSILON) {
                f2 = ((float) gyroAnimationFrame.mo35772f()) * Math.abs(b2);
            } else {
                f2 = ((float) gyroAnimationFrame.mo35768d()) * b2;
            }
            view.setTranslationY(f2);
            i = i2;
        }
    }

    /* renamed from: d */
    public final void mo35781d(List list, C43075l lVar) {
        C41536l.m120489i(list, "frames");
        C41536l.m120489i(lVar, "onGlideRequestBuild");
        this.f39530d.clear();
        removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GyroAnimationFrame gyroAnimationFrame = (GyroAnimationFrame) it.next();
            this.f39530d.add(gyroAnimationFrame);
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C18368l.m62777z(imageView, gyroAnimationFrame.mo35766a(), lVar);
            addView(imageView);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GyroAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GyroAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39530d = new ArrayList();
    }
}
