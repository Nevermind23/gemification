package p503lg;

import android.view.View;
import p341ge.bog.chat.domain.model.components.CalendarRangeComponent;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: lg.f */
public final /* synthetic */ class C16566f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomIncomingMessageViewHolder f46725d;

    /* renamed from: e */
    public final /* synthetic */ boolean f46726e;

    /* renamed from: f */
    public final /* synthetic */ CalendarRangeComponent f46727f;

    /* renamed from: g */
    public final /* synthetic */ Input f46728g;

    public /* synthetic */ C16566f(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, boolean z, CalendarRangeComponent calendarRangeComponent, Input input) {
        this.f46725d = customIncomingMessageViewHolder;
        this.f46726e = z;
        this.f46727f = calendarRangeComponent;
        this.f46728g = input;
    }

    public final void onClick(View view) {
        CustomIncomingMessageViewHolder.m49295K(this.f46725d, this.f46726e, this.f46727f, this.f46728g, view);
    }
}
