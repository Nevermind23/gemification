package zb1;

import he1.C41233s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zb1.d */
public final class C40239d {

    /* renamed from: a */
    public static final C40239d f95625a = new C40239d();

    /* renamed from: b */
    private static final Map f95626b = C41344r0.m119931m(C41233s.m119492a("identomat_card_front_instructions", "პირადობის წინა მხარის ინსტრუქცია"), C41233s.m119492a("identomat_card_rear_instructions", "პირადობის  უკანა მხარის"), C41233s.m119492a("identomat_passport_instructions", "პასპორტის ინსტრუქციები"), C41233s.m119492a("identomat_scan_retry_instruction", "Please try again in better lighting"), C41233s.m119492a("identomat_camera_permission_text", "Permission on camera is restricted, without camera, app can't progress forward, please go to settings and check camera permission."), C41233s.m119492a("identomat_camera_deny_title", "Camera access denied"), C41233s.m119492a("identomat_document_type_unknown", "Unknown document type"), C41233s.m119492a("identomat_document_move_closer", "Please move document closer"), C41233s.m119492a("identomat_face_require_brighter", "Low light"), C41233s.m119492a("identomat_document_face_blurry", "Face on document is blurry"), C41233s.m119492a("identomat_passport_instructions", "Passport photo page"), C41233s.m119492a("identomat_document_move_left", "Please move document to the left"), C41233s.m119492a("identomat_document_grayscale", "Document is grayscale"), C41233s.m119492a("identomat_camera_deny_settings", "Allow access"), C41233s.m119492a("identomat_card_rear_instructions", "Scan BACK SIDE of ID CARD"), C41233s.m119492a("identomat_face_too_bright", "Avoid direct light"), C41233s.m119492a("identomat_document_move_down", "Please move document down"), C41233s.m119492a("identomat_document_spoofing_detected2", "Document spoofing detected"), C41233s.m119492a("identomat_camera_permission_title", "Can't access the camera"), C41233s.m119492a("identomat_document_format_mismatch", "Document format mismatch"), C41233s.m119492a("identomat_document_not_readable", "Document not readable"), C41233s.m119492a("identomat_document_face_align", "Document face align"), C41233s.m119492a("identomat_camera_deny_cancel", "Cancel process"), C41233s.m119492a("identomat_card_front_instructions", "Scan FRONT SIDE of ID CARD"), C41233s.m119492a("identomat_document_covered", "Document is covered"), C41233s.m119492a("identomat_document_move_right", "Please move document to the right"), C41233s.m119492a("identomat_document_type_mismatch", "Wrong document"), C41233s.m119492a("identomat_liveness_retry_again", "Try again"), C41233s.m119492a("identomat_document_align", "Frame your document"), C41233s.m119492a("identomat_document_move_away", "Please move document away"), C41233s.m119492a("identomat_scan_retry_title", "Capture failed"), C41233s.m119492a("identomat_document_blurry", "Document is blurry"));

    /* renamed from: c */
    private static final List f95627c;

    /* renamed from: d */
    private static final Map f95628d;

    static {
        List m = C41341q.m119910m("identomat_agree", "identomat_title", "identomat_agree_page_title", "identomat_capture_method_title", "identomat_card_front_instructions", "identomat_card_front_upload", "identomat_card_looks_fine", "identomat_card_rear_instructions", "identomat_card_rear_upload", "identomat_choose_file", "identomat_continue", "identomat_disagree", "identomat_driver_license", "identomat_driver_license_front_instructions", "identomat_driver_license_front_upload", "identomat_driver_license_rear_instructions", "identomat_driver_license_rear_upload", "identomat_ukr_driver_license", "identomat_ukr_driver_license_front_instructions", "identomat_ukr_driver_license_front_upload", "identomat_ukr_driver_license_rear_instructions", "identomat_ukr_driver_license_rear_upload", "identomat_face_instructions", "identomat_face_looks_fine", "identomat_card", "identomat_im_ready", "identomat_initializing", "identomat_lets_try", "identomat_passport", "identomat_passport_instructions", "identomat_passport_upload", "identomat_ukr_passport", "identomat_record_begin_section_1", "identomat_record_begin_section_2", "identomat_record_begin_section_3", "identomat_record_begin_title", "identomat_record_fail_description", "identomat_record_fail_title", "identomat_record_instructions", "identomat_residence_permit", "identomat_residence_permit_front_instructions", "identomat_residence_permit_front_upload", "identomat_residence_permit_rear_instructions", "identomat_residence_permit_rear_upload", "identomat_inn", "identomat_scan_inn", "identomat_retake_photo", "identomat_retry", "identomat_scan_code", "identomat_scan_me", "identomat_select_document", "identomat_neutral_expression", "identomat_smile", "identomat_take_photo", "identomat_upload_another_file", "identomat_upload_file", "identomat_uploading", "identomat_verifying", "identomat_upload_instructions_1", "identomat_upload_instructions_2", "identomat_upload_instructions_3", "identomat_document_align", "identomat_document_blurry", "identomat_document_face_blurry", "identomat_document_face_require_brighter", "identomat_document_face_too_bright", "identomat_document_move_away", "identomat_document_move_closer", "identomat_document_move_down", "identomat_document_move_left", "identomat_document_move_right", "identomat_document_move_up", "identomat_document_type_unknown", "identomat_document_covered", "identomat_document_grayscale", "identomat_document_format_mismatch", "identomat_document_type_mismatch", "identomat_document_not_readable", "identomat_document_face_align", "identomat_document_spoofing_detected2", "identomat_document_page_mismatch", "identomat_face_look_straight", "identomat_face_mismatch", "identomat_face_align", "identomat_face_away_from_center", "identomat_face_blurry", "identomat_face_far_away", "identomat_face_require_brighter", "identomat_face_too_bright", "identomat_face_too_close", "identomat_no_document_in_image", "identomat_smile_detected", "identomat_upload_success", "identomat_scan_success", "identomat_scan_success_info", "identomat_liveness_success", "identomat_camera_permission_title", "identomat_camera_permission_text", "identomat_audio_permission_title", "identomat_audio_permission_text", "no_connection", "identomat_scan_retry_title", "identomat_scan_retry_instruction", "identomat_scan_retry_again", "identomat_scan_retry_cancel", "identomat_liveness_retry_title", "identomat_liveness_retry_instruction", "identomat_liveness_retry_again", "identomat_liveness_retry_instruction_1", "identomat_liveness_retry_instruction_2", "identomat_camera_deny_title", "identomat_camera_deny_settings", "identomat_camera_deny_cancel");
        f95627c = m;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(m, 10)), 16));
        for (Object next : m) {
            linkedHashMap.put(next, C40439w.m117102A((String) next, '_', '.', false, 4, (Object) null));
        }
        f95628d = linkedHashMap;
    }

    private C40239d() {
    }

    /* renamed from: a */
    public final Map mo94191a() {
        return f95626b;
    }

    /* renamed from: b */
    public final Map mo94192b() {
        return f95628d;
    }
}
