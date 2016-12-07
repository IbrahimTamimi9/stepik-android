package org.stepic.droid.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.stepic.droid.model.CertificateViewItem;
import org.stepic.droid.model.Course;
import org.stepic.droid.model.Lesson;
import org.stepic.droid.model.Section;
import org.stepic.droid.model.Step;
import org.stepic.droid.model.Unit;
import org.stepic.droid.store.operations.Table;
import org.stepic.droid.web.ViewAssignment;

public interface ScreenManager {
    void showLaunchScreen(Context context, boolean overrideAnimation);

    void showRegistration(Activity sourceActivity);

    void showLogin(Activity sourceActivity);

    void showMainFeed(Context sourceActivity);

    void showCourseDescription(Fragment sourceActivity, @NotNull Course course);

    void showPdfInBrowserByGoogleDocs(Activity activity, String fullPath);

    void openComments(Context context, String discussionProxyId, long stepId);

    void openNewCommentForm(Activity sourceActivity, Long target, @Nullable Long parent);

    void showSections(Activity sourceActivity, @NotNull Course course);

    void showSections(Activity sourceActivity, @NotNull Course course, boolean joinedRightNow);

    void showUnitsForSection(Context sourceActivity, @NotNull Section section);

    void showSteps(Activity sourceActivity, Unit unit, Lesson lesson, @Nullable Section section);

    void showSteps(Activity sourceActivity, Unit unit, Lesson lesson, boolean backAnimation, @Nullable Section section);

    void openStepInWeb(Context context, Step step);

    void openRemindPassword(AppCompatActivity context);

    void pushToViewedQueue(ViewAssignment viewAssignmentWrapper);

    void showCourseDescription(Activity sourceActivity, @NotNull Course course);

    void showTextFeedback(Activity sourceActivity);

    void showStoreWithApp(Activity sourceActivity);

    void showDownload();

    void showDownload(Context context);

    void showFindCourses(Context context);

    Intent getShowFindCoursesIntent (Context context);

    void showVideo(Activity sourceActivity, String source, Long videoId);

    void showSettings(Activity sourceActivity);

    void showStorageManagement(Activity activity);

    void openInWeb(Activity context, String path);

    void addCertificateToLinkedIn(CertificateViewItem certificateViewItem);

    void showFilterScreen(Fragment sourceFragment, int requestCode, Table courseType);

    void showCertificates();

    void openSyllabusInWeb(Context context, long courseId);

    Intent getCertificateIntent();

    Intent getOpenInWebIntent(String path);

    void openProfile(Activity activity);

    void openProfile(Activity activity, long userId);

    void openFeedbackActivity (Activity activity);

    Intent getMyCoursesIntent(@NotNull Context context);

    @Nullable
    Intent getProfileIntent(@NotNull Context context);

    void openSplash(Context context);

    void openAboutActivity(Activity activity);

    void openPrivacyPolicyWeb(Activity activity);

    void openTermsOfServiceWeb(Activity activity);
}
