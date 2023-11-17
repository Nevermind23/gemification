package com.medallia.digital.mobilesdk;

import android.content.Intent;

final class Broadcasts {
    protected static final String PROPERTY_ID_CHANGE = "com.medallia.digital.mobilesdk.PROPERTY_ID_CHANGE";
    protected static final String PROPERTY_ID_VALUE = "com.medallia.digital.mobilesdk.PROPERTY_ID_VALUE";
    protected static final String SYNC_USERJOURNEY_ACTION = "com.medallia.digital.mobilesdk.sync_userjourney_action";

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$a */
    protected static class C10683a {

        /* renamed from: a */
        protected static final String f30475a = "com.medallia.digital.mobilesdk.MedalliaFullFormActivity";

        /* renamed from: b */
        protected static final String f30476b = "com.medallia.digital.mobilesdk.MedalliaModalFormActivity";

        /* renamed from: c */
        protected static final String f30477c = "com.medallia.digital.mobilesdk.form_data";

        /* renamed from: d */
        protected static final String f30478d = "com.medallia.digital.mobilesdk.is_show_form";

        /* renamed from: e */
        protected static final String f30479e = "com.medallia.digital.mobilesdk.spinner_delay";

        /* renamed from: f */
        protected static final String f30480f = "com.medallia.digital.mobilesdk.vuln_enabled";

        /* renamed from: g */
        protected static final String f30481g = "com.medallia.digital.mobilesdk.FinishInvitationActivity";

        /* renamed from: h */
        protected static final String f30482h = "com.medallia.digital.mobilesdk.show_invitation_start_time";

        /* renamed from: i */
        protected static final String f30483i = "com.medallia.digital.mobilesdk.inherit_orientation";

        /* renamed from: j */
        protected static final String f30484j = "com.medallia.digital.mobilesdk.form_preview_data";

        /* renamed from: k */
        protected static final String f30485k = "com.medallia.digital.mobilesdk.form_is_preview_app";

        /* renamed from: l */
        protected static final String f30486l = "com.medallia.digital.mobilesdk.form_header_palette";

        /* renamed from: m */
        protected static final String f30487m = "com.medallia.digital.mobilesdk.user_media_capture_conf";

        protected C10683a() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$b */
    protected static class C10684b {

        /* renamed from: a */
        protected static final String f30488a = "com.medallia.digital.mobilesdk.custom_intercept_action";

        /* renamed from: b */
        protected static final String f30489b = "com.medallia.digital.mobilesdk.extra_form_preload_timestamp";

        /* renamed from: c */
        protected static final String f30490c = "com.medallia.digital.mobilesdk.extra_engagement_id";

        /* renamed from: d */
        protected static final String f30491d = "com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp";

        /* renamed from: e */
        protected static final String f30492e = "com.medallia.digital.mobilesdk.extra_custom_intercept_command";

        /* renamed from: f */
        protected static final String f30493f = "com.medallia.digital.mobilesdk.extra_engagement_type";

        /* renamed from: g */
        protected static final String f30494g = "com.medallia.digital.mobilesdk.extra_payload";

        /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$b$a */
        protected enum C10685a {
            TargetEvaluationSuccess
        }

        protected C10684b() {
        }

        /* renamed from: a */
        protected static void m38935a(C10685a aVar, String str, long j, long j2, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
            Intent intent = new Intent(f30488a);
            intent.putExtra(f30492e, aVar);
            intent.putExtra(f30490c, str);
            intent.putExtra(f30489b, j);
            intent.putExtra(f30491d, j2);
            intent.putExtra(f30493f, mDEngagementType);
            intent.putExtra(f30494g, mDCustomInterceptPayload);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$c */
    protected static class C10686c {

        /* renamed from: a */
        protected static final String f30497a = "com.medallia.digital.mobilesdk.file_action";

        /* renamed from: b */
        protected static final String f30498b = "com.medallia.digital.mobilesdk.extra_file_path";

        /* renamed from: c */
        protected static final String f30499c = "com.medallia.digital.mobilesdk.extra_IS_DELETED";

        /* renamed from: d */
        protected static final String f30500d = "com.medallia.digital.mobilesdk.extra_files_command";

        /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$c$a */
        protected enum C10687a {
            fileDeleted
        }

        protected C10686c() {
        }

        /* renamed from: a */
        protected static void m38936a(C10687a aVar, String str, boolean z) {
            Intent intent = new Intent(f30497a);
            intent.putExtra(f30500d, aVar);
            intent.putExtra(f30498b, str);
            intent.putExtra(f30499c, z);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$d */
    protected static class C10688d {

        /* renamed from: a */
        protected static final String f30503a = "com.medallia.digital.mobilesdk.form_action";

        /* renamed from: b */
        protected static final String f30504b = "com.medallia.digital.mobilesdk.feedback_action";

        /* renamed from: c */
        protected static final String f30505c = "com.medallia.digital.mobilesdk.invitation_action";

        /* renamed from: d */
        protected static final String f30506d = "com.medallia.digital.mobilesdk.feedback_preview_action";

        /* renamed from: e */
        protected static final String f30507e = "com.medallia.digital.mobilesdk.extra_option";

        /* renamed from: f */
        protected static final String f30508f = "com.medallia.digital.mobilesdk.extra_timestamp";

        /* renamed from: g */
        protected static final String f30509g = "com.medallia.digital.mobilesdk.extra_form_id";

        /* renamed from: h */
        protected static final String f30510h = "com.medallia.digital.mobilesdk.extra_form_view_type";

        /* renamed from: i */
        protected static final String f30511i = "com.medallia.digital.mobilesdk.extra_form_locale_set";

        /* renamed from: j */
        protected static final String f30512j = "com.medallia.digital.mobilesdk.extra_form_locale_display";

        /* renamed from: k */
        protected static final String f30513k = "com.medallia.digital.mobilesdk.extra_form_trigger_type";

        /* renamed from: l */
        protected static final String f30514l = "com.medallia.digital.mobilesdk.extra_reason";

        /* renamed from: m */
        protected static final String f30515m = "com.medallia.digital.mobilesdk.extra_form_url";

        /* renamed from: n */
        protected static final String f30516n = "com.medallia.digital.mobilesdk.extra_form_time_to_display";

        /* renamed from: o */
        protected static final String f30517o = "com.medallia.digital.mobilesdk.extra_feedback_payload";

        /* renamed from: p */
        protected static final String f30518p = "com.medallia.digital.mobilesdk.extra_feedback_id";

        /* renamed from: q */
        protected static final String f30519q = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display";

        /* renamed from: r */
        protected static final String f30520r = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display";

        /* renamed from: s */
        protected static final String f30521s = "com.medallia.digital.mobilesdk.extra_form_header_appearance_set";

        /* renamed from: t */
        protected static final String f30522t = "com.medallia.digital.mobilesdk.extra_form_header_appearance_display";

        /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$d$a */
        protected enum C10689a {
            formSubmitted,
            formDismissed,
            formClosed,
            formDisplayed,
            formLinkSelected,
            formBlockedUrl,
            feedbackPayload,
            formThankYouPrompt
        }

        /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$d$b */
        protected enum C10690b {
            invitationDisplayed,
            invitationAccepted,
            invitationDeclined,
            invitationDeferred
        }

        protected C10688d() {
        }

        /* renamed from: a */
        protected static void m38937a(C10689a aVar, String str) {
            Intent intent = new Intent(f30506d);
            intent.putExtra(f30507e, aVar);
            intent.putExtra(f30509g, str);
            C10884i4.m39721c().mo28483b().sendBroadcast(intent);
        }

        /* renamed from: a */
        protected static void m38938a(C10689a aVar, String str, FormTriggerType formTriggerType) {
            m38941a(aVar, str, formTriggerType, (FormViewType) null, 0, (String) null, (String) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
        }

        /* renamed from: a */
        protected static void m38939a(C10689a aVar, String str, FormTriggerType formTriggerType, long j) {
            m38941a(aVar, str, formTriggerType, (FormViewType) null, j, (String) null, (String) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
        }

        /* renamed from: a */
        protected static void m38940a(C10689a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType) {
            m38941a(aVar, str, formTriggerType, formViewType, 0, (String) null, (String) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
        }

        /* renamed from: a */
        protected static void m38941a(C10689a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j, String str2, String str3, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            m38942a(aVar, str, formTriggerType, formViewType, (String) null, j, str2, str3, (Boolean) null, (Boolean) null, mDAppearanceMode, mDAppearanceMode2);
        }

        /* renamed from: a */
        protected static void m38942a(C10689a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, String str2, long j, String str3, String str4, Boolean bool, Boolean bool2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            Intent intent = new Intent(f30503a);
            intent.putExtra(f30507e, aVar);
            intent.putExtra(f30509g, str);
            intent.putExtra(f30513k, formTriggerType);
            intent.putExtra(f30508f, System.currentTimeMillis());
            intent.putExtra(f30516n, j);
            intent.putExtra(f30510h, formViewType);
            intent.putExtra(f30511i, str3);
            intent.putExtra(f30512j, str4);
            if (str2 != null) {
                intent.putExtra(f30515m, str2);
            }
            if (aVar == C10689a.formThankYouPrompt) {
                intent.putExtra(f30519q, bool);
                intent.putExtra(f30520r, bool2);
                intent.putExtra(f30521s, mDAppearanceMode);
                intent.putExtra(f30522t, mDAppearanceMode2);
            }
            if (!(aVar != C10689a.formDisplayed || mDAppearanceMode == null || mDAppearanceMode2 == null)) {
                intent.putExtra(f30521s, mDAppearanceMode);
                intent.putExtra(f30522t, mDAppearanceMode2);
            }
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }

        /* renamed from: a */
        public static void m38943a(C10689a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, boolean z, boolean z2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            m38942a(aVar, str, formTriggerType, formViewType, (String) null, 0, (String) null, (String) null, Boolean.valueOf(z), Boolean.valueOf(z2), mDAppearanceMode, mDAppearanceMode2);
        }

        /* renamed from: a */
        protected static void m38944a(C10689a aVar, String str, FormTriggerType formTriggerType, String str2) {
            m38942a(aVar, str, formTriggerType, (FormViewType) null, str2, 0, (String) null, (String) null, (Boolean) null, (Boolean) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
        }

        /* renamed from: a */
        protected static void m38945a(C10689a aVar, String str, FormTriggerType formTriggerType, String str2, String str3) {
            Intent intent = new Intent(f30504b);
            intent.putExtra(f30507e, aVar);
            intent.putExtra(f30509g, str);
            intent.putExtra(f30513k, formTriggerType);
            intent.putExtra(f30508f, System.currentTimeMillis());
            intent.putExtra(f30518p, str2);
            intent.putExtra(f30517o, str3);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$e */
    protected static class C10691e {

        /* renamed from: a */
        protected static final String f30537a = "com.medallia.digital.mobilesdk.intercept_action";

        /* renamed from: b */
        protected static final String f30538b = "com.medallia.digital.mobilesdk.extra_timestamp";

        /* renamed from: c */
        protected static final String f30539c = "com.medallia.digital.mobilesdk.extra_id";

        /* renamed from: d */
        protected static final String f30540d = "com.medallia.digital.mobilesdk.extra_reason";

        /* renamed from: e */
        protected static final String f30541e = "com.medallia.digital.mobilesdk.extra_intercept_command";

        /* renamed from: f */
        protected static final String f30542f = "com.medallia.digital.mobilesdk.extra_engagement_type";

        /* renamed from: g */
        protected static final String f30543g = "com.medallia.digital.mobilesdk.extra_invite_type";

        /* renamed from: h */
        protected static final String f30544h = "com.medallia.digital.mobilesdk.extra_intercept_appearance_set";

        /* renamed from: i */
        protected static final String f30545i = "com.medallia.digital.mobilesdk.extra_intercept_appearance_display";

        /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$e$a */
        protected enum C10692a {
            interceptDisplayed,
            interceptAccepted,
            interceptDeclined,
            interceptDeferred,
            interceptClosed,
            interceptTriggered
        }

        protected C10691e() {
        }

        /* renamed from: a */
        public static void m38946a(C10692a aVar, String str) {
            m38948a(aVar, str, (String) null, (MDEngagementType) null, (C10880i3) null, (MDAppearanceMode) null, (MDAppearanceMode) null);
        }

        /* renamed from: a */
        public static void m38947a(C10692a aVar, String str, String str2, MDEngagementType mDEngagementType, C10880i3 i3Var) {
            m38948a(aVar, str, str2, mDEngagementType, i3Var, (MDAppearanceMode) null, (MDAppearanceMode) null);
        }

        /* renamed from: a */
        protected static void m38948a(C10692a aVar, String str, String str2, MDEngagementType mDEngagementType, C10880i3 i3Var, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            Intent intent = new Intent(f30537a);
            intent.putExtra(f30541e, aVar);
            intent.putExtra(f30539c, str);
            intent.putExtra(f30538b, System.currentTimeMillis());
            intent.putExtra(f30542f, mDEngagementType);
            intent.putExtra(f30543g, str2);
            if (i3Var != null) {
                intent.putExtra(f30540d, i3Var);
            }
            if (!(aVar != C10692a.interceptDisplayed || mDAppearanceMode == null || mDAppearanceMode2 == null)) {
                intent.putExtra(f30544h, mDAppearanceMode);
                intent.putExtra(f30545i, mDAppearanceMode2);
            }
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$f */
    protected static class C10693f {

        /* renamed from: a */
        protected static final String f30553a = "com.medallia.digital.mobilesdk.localization_action";

        /* renamed from: b */
        protected static final String f30554b = "com.medallia.digital.mobilesdk.extra_error";

        /* renamed from: c */
        protected static final String f30555c = "com.medallia.digital.mobilesdk.extra_success";

        protected C10693f() {
        }

        /* renamed from: a */
        protected static void m38949a() {
            Intent intent = new Intent(f30553a);
            intent.putExtra(f30555c, "");
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }

        /* renamed from: a */
        protected static void m38950a(MDExternalError mDExternalError) {
            Intent intent = new Intent(f30553a);
            intent.putExtra(f30554b, mDExternalError);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }

        /* renamed from: a */
        protected static void m38951a(String str) {
            Intent intent = new Intent(f30553a);
            intent.putExtra(f30555c, str);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$g */
    protected static class C10694g {

        /* renamed from: a */
        protected static final String f30556a = "com.medallia.digital.mobilesdk.SESSION_STARTED";

        /* renamed from: b */
        protected static final String f30557b = "com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE";

        /* renamed from: c */
        protected static final String f30558c = "com.medallia.digital.mobilesdk.SESSION_ID_VALUE";

        protected C10694g() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.Broadcasts$h */
    protected static class C10695h {

        /* renamed from: a */
        protected static final String f30559a = "com.medallia.digital.mobilesdk.tre_action";

        /* renamed from: b */
        protected static final String f30560b = "com.medallia.digital.mobilesdk.extra_data";

        protected C10695h() {
        }

        /* renamed from: a */
        protected static void m38952a(String str) {
            Intent intent = new Intent(f30559a);
            intent.putExtra(f30560b, str);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        }
    }

    Broadcasts() {
    }
}
