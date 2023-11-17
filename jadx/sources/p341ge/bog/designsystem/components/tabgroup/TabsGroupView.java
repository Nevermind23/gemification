package p341ge.bog.designsystem.components.tabgroup;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.C0267d;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.C41536l;
import p601sg.C17777b;
import p601sg.C17783h;
import p601sg.C17786k;

/* renamed from: ge.bog.designsystem.components.tabgroup.TabsGroupView */
public final class TabsGroupView extends TabLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabsGroupView(Context context, AttributeSet attributeSet) {
        super(new C0267d(context, C17786k.BOGTabGroupStyle), attributeSet, C17777b.f49591I);
        C41536l.m120489i(context, "context");
    }

    public void addTab(TabLayout.C5153g gVar, int i, boolean z) {
        C41536l.m120489i(gVar, "tab");
        gVar.mo16966o(C17783h.layout_tab_group);
        super.addTab(gVar, i, z);
    }
}
