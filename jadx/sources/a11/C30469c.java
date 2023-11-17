package a11;

import android.app.Application;
import g91.C32343x;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.releasenotes.presentation.model.NewFeature;
import u01.C39003d;

/* renamed from: a11.c */
public final class C30469c {

    /* renamed from: a */
    private final Application f76464a;

    public C30469c(Application application) {
        C41536l.m120489i(application, "app");
        this.f76464a = application;
    }

    /* renamed from: a */
    public final List mo70806a(List list) {
        Image image;
        String str;
        int i;
        Application application;
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C41341q.m119917t();
            }
            NewFeature newFeature = (NewFeature) next;
            if (newFeature.isAnimation()) {
                image = new Image.Animation.Raw(C32359z0.m95553X(this.f76464a.getApplicationContext(), newFeature.getImageResName()), (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null);
            } else {
                image = new Image.Resource(C32359z0.m95536G(this.f76464a.getApplicationContext(), newFeature.getImageResName()), (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            String F = C32343x.m95388F(newFeature.getTitleResName(), new Object[0]);
            String F2 = C32343x.m95388F(newFeature.getDescriptionResName(), new Object[0]);
            String buttonResName = newFeature.getButtonResName();
            if (buttonResName == null || (str = C32343x.m95388F(buttonResName, new Object[0])) == null) {
                if (i2 == list.size() - 1) {
                    application = this.f76464a;
                    i = C39003d.btn_close;
                } else {
                    application = this.f76464a;
                    i = C39003d.btn_next;
                }
                str = application.getString(i);
                C41536l.m120488h(str, "if (index == list.size -…ext\n                    )");
            }
            arrayList.add(new C30466a(image, F, F2, str));
            i2 = i3;
        }
        return arrayList;
    }
}
