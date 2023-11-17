package kc1;

import android.content.Context;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10220y;
import ba1.C10221z;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.AdditionalAction;
import p363bh.C10277c;
import p519mi.C16686a;

/* renamed from: kc1.h */
public final class C41476h {

    /* renamed from: kc1.h$a */
    public enum C41477a {
        f97627d,
        UN_TRUST,
        LEAVE_ONE,
        LEAVE_ALL,
        f97631h
    }

    /* renamed from: a */
    public final C10277c mo96242a(Context context) {
        C41536l.m120489i(context, "context");
        int i = C10221z.f28408a;
        int i2 = C10221z.f28409b;
        int i3 = C10212q.f28270d;
        int i4 = C10212q.f28271e;
        String string = context.getString(C10220y.customer_devices_edit_action_sheet_edit_text);
        C41536l.m120488h(string, "context.getString(R.stri…t_action_sheet_edit_text)");
        String string2 = context.getString(C10220y.customer_devices_edit_action_sheet_exit_all_text);
        C41536l.m120488h(string2, "context.getString(R.stri…tion_sheet_exit_all_text)");
        List m = C41341q.m119910m(new AdditionalAction(string, C41477a.f97631h, i, Integer.valueOf(C10214s.f28282q), Integer.valueOf(i3)), new AdditionalAction(string2, C41477a.LEAVE_ALL, i2, Integer.valueOf(C10214s.icons_24_system_log_out), Integer.valueOf(i4)));
        C10277c.C10278a aVar = C10277c.f28509D;
        String string3 = context.getString(C10220y.customer_devices_additional_action_sheet_title);
        C41536l.m120488h(string3, "context.getString(R.stri…ional_action_sheet_title)");
        return C10277c.C10278a.m37472b(aVar, string3, m, (String) null, (C16686a) null, 12, (Object) null);
    }

    /* renamed from: b */
    public final C10277c mo96243b(Context context) {
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        int i = C10221z.f28408a;
        int i2 = C10221z.f28410c;
        int i3 = C10212q.f28270d;
        int i4 = C10212q.f28274i;
        String string = context2.getString(C10220y.customer_devices_trusted_device_action_sheet_untrust_text);
        C41536l.m120488h(string, "context.getString(R.stri…ction_sheet_untrust_text)");
        String string2 = context2.getString(C10220y.customer_devices_trusted_device_action_sheet_exit_text);
        C41536l.m120488h(string2, "context.getString(R.stri…e_action_sheet_exit_text)");
        List m = C41341q.m119910m(new AdditionalAction(string, C41477a.UN_TRUST, i2, Integer.valueOf(C10214s.f28283t), Integer.valueOf(i4)), new AdditionalAction(string2, C41477a.LEAVE_ONE, i, Integer.valueOf(C10214s.icons_24_system_log_out), Integer.valueOf(i3)));
        C10277c.C10278a aVar = C10277c.f28509D;
        String string3 = context2.getString(C10220y.customer_devices_additional_action_sheet_title);
        C41536l.m120488h(string3, "context.getString(R.stri…ional_action_sheet_title)");
        return C10277c.C10278a.m37472b(aVar, string3, m, (String) null, (C16686a) null, 12, (Object) null);
    }

    /* renamed from: c */
    public final C10277c mo96244c(Context context) {
        C41536l.m120489i(context, "context");
        int i = C10221z.f28408a;
        int i2 = C10212q.f28270d;
        String string = context.getString(C10220y.customer_devices_untrusted_device_action_sheet_trust_text);
        C41536l.m120488h(string, "context.getString(R.stri…_action_sheet_trust_text)");
        int i3 = i;
        String string2 = context.getString(C10220y.customer_devices_untrusted_device_action_sheet_exit_text);
        C41536l.m120488h(string2, "context.getString(R.stri…e_action_sheet_exit_text)");
        List m = C41341q.m119910m(new AdditionalAction(string, C41477a.f97627d, i3, Integer.valueOf(C10214s.f28284u), Integer.valueOf(i2)), new AdditionalAction(string2, C41477a.LEAVE_ONE, i3, Integer.valueOf(C10214s.icons_24_system_log_out), Integer.valueOf(i2)));
        C10277c.C10278a aVar = C10277c.f28509D;
        String string3 = context.getString(C10220y.customer_devices_additional_action_sheet_title);
        C41536l.m120488h(string3, "context.getString(R.stri…ional_action_sheet_title)");
        return C10277c.C10278a.m37472b(aVar, string3, m, (String) null, (C16686a) null, 12, (Object) null);
    }
}
