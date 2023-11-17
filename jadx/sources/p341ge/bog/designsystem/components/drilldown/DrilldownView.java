package p341ge.bog.designsystem.components.drilldown;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p364bi.C10289a;
import p393di.C12131b;

/* renamed from: ge.bog.designsystem.components.drilldown.DrilldownView */
public final class DrilldownView extends LinearLayout {

    /* renamed from: d */
    private C10289a f39448d;

    /* renamed from: ge.bog.designsystem.components.drilldown.DrilldownView$a */
    public interface C13322a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DrilldownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final C12131b getData() {
        return this.f39448d.mo26893c();
    }

    public final C13322a getListener() {
        this.f39448d.mo26896f();
        return null;
    }

    public final CharSequence getTitle() {
        return this.f39448d.mo26897g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f39448d.mo26898h() != -1) {
            i = View.MeasureSpec.makeMeasureSpec(this.f39448d.mo26898h(), 1073741824);
        }
        if (this.f39448d.mo26895e() != -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f39448d.mo26895e(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setData(C12131b bVar) {
        this.f39448d.mo26899i(bVar);
    }

    public final void setListener(C13322a aVar) {
        this.f39448d.mo26900j(aVar);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39448d.mo26901k(charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrilldownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [bi.a] */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r2v4, types: [bi.a$b] */
    /* JADX WARNING: type inference failed for: r2v5, types: [bi.a$a] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrilldownView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            r10.<init>(r11, r12, r13)
            android.content.res.Resources$Theme r13 = r11.getTheme()
            int[] r0 = p601sg.C17787l.f50475p4
            r1 = 0
            android.content.res.TypedArray r12 = r13.obtainStyledAttributes(r12, r0, r1, r1)
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)     // Catch:{ all -> 0x0094 }
            int r13 = p601sg.C17787l.f50523s4     // Catch:{ all -> 0x0094 }
            int r0 = p601sg.C17786k.TextH4Positive200Left     // Catch:{ all -> 0x0094 }
            int r6 = r12.getResourceId(r13, r0)     // Catch:{ all -> 0x0094 }
            int r13 = p601sg.C17787l.f50491q4     // Catch:{ all -> 0x0094 }
            int r0 = p601sg.C17786k.f49826S0     // Catch:{ all -> 0x0094 }
            int r7 = r12.getResourceId(r13, r0)     // Catch:{ all -> 0x0094 }
            int r13 = p601sg.C17787l.f50555u4     // Catch:{ all -> 0x0094 }
            int r13 = r12.getInt(r13, r1)     // Catch:{ all -> 0x0094 }
            int r0 = p601sg.C17787l.f50507r4     // Catch:{ all -> 0x0094 }
            int r1 = p601sg.C17778c.f49638w     // Catch:{ all -> 0x0094 }
            int r4 = r12.getResourceId(r0, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "inflate(layoutInflater, this@DrilldownView, true)"
            r1 = 1
            if (r13 == 0) goto L_0x0079
            if (r13 == r1) goto L_0x006c
            r2 = 2
            if (r13 == r2) goto L_0x005b
            r2 = 3
            if (r13 != r2) goto L_0x0053
            bi.a$a r13 = new bi.a$a     // Catch:{ all -> 0x0094 }
            ak.g2 r3 = p352ak.C9918g2.m36381d(r11, r10, r1)     // Catch:{ all -> 0x0094 }
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)     // Catch:{ all -> 0x0094 }
            r5 = 0
            r8 = 4
            r9 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0094 }
            goto L_0x0085
        L_0x0053:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0094 }
            java.lang.String r13 = "Unknown Button type"
            r11.<init>(r13)     // Catch:{ all -> 0x0094 }
            throw r11     // Catch:{ all -> 0x0094 }
        L_0x005b:
            bi.a$b r13 = new bi.a$b     // Catch:{ all -> 0x0094 }
            ak.g2 r3 = p352ak.C9918g2.m36381d(r11, r10, r1)     // Catch:{ all -> 0x0094 }
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)     // Catch:{ all -> 0x0094 }
            r5 = 0
            r8 = 4
            r9 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0094 }
            goto L_0x0085
        L_0x006c:
            bi.a$c r13 = new bi.a$c     // Catch:{ all -> 0x0094 }
            ak.h2 r11 = p352ak.C9926h2.m36410d(r11, r10, r1)     // Catch:{ all -> 0x0094 }
            kotlin.jvm.internal.C41536l.m120488h(r11, r0)     // Catch:{ all -> 0x0094 }
            r13.<init>(r11, r4, r6)     // Catch:{ all -> 0x0094 }
            goto L_0x0085
        L_0x0079:
            bi.a$d r13 = new bi.a$d     // Catch:{ all -> 0x0094 }
            ak.f2 r11 = p352ak.C9910f2.m36352d(r11, r10, r1)     // Catch:{ all -> 0x0094 }
            kotlin.jvm.internal.C41536l.m120488h(r11, r0)     // Catch:{ all -> 0x0094 }
            r13.<init>(r11, r4)     // Catch:{ all -> 0x0094 }
        L_0x0085:
            r10.f39448d = r13     // Catch:{ all -> 0x0094 }
            int r11 = p601sg.C17787l.f50539t4     // Catch:{ UnsupportedOperationException -> 0x0090 }
            java.lang.String r11 = r12.getNonResourceString(r11)     // Catch:{ UnsupportedOperationException -> 0x0090 }
            r10.setTitle(r11)     // Catch:{ UnsupportedOperationException -> 0x0090 }
        L_0x0090:
            r12.recycle()
            return
        L_0x0094:
            r11 = move-exception
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.drilldown.DrilldownView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
