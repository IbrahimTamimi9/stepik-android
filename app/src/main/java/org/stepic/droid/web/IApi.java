package org.stepic.droid.web;

import android.content.Context;

import org.stepic.droid.model.Course;
import org.stepic.droid.model.Reply;
import org.stepic.droid.social.SocialManager;

import retrofit.Call;

public interface IApi {
    enum TokenType {
        social, loginPassword
    }

    Call<AuthenticationStepicResponse> authWithLoginPassword(String login, String password);

    Call<AuthenticationStepicResponse> authWithCode(String code);

    Call<IStepicResponse> signUp(String firstName, String secondName, String email, String password);

    Call<CoursesStepicResponse> getEnrolledCourses(int page);

    Call<CoursesStepicResponse> getFeaturedCourses(int page);

    Call<StepicProfileResponse> getUserProfile();

    Call<UserStepicResponse> getUsers(long[] userIds);

    Call<Void> tryJoinCourse(Course course);

    Call<SectionsStepicResponse> getSections(long[] sectionsIds);

    Call<UnitStepicResponse> getUnits(long[] units);

    Call<LessonStepicResponse> getLessons(long[] lessons);

    Call<StepResponse> getSteps(long[] steps);

    Call<Void> dropCourse(long courseId);

    Call<ProgressesResponse> getProgresses(String[] progresses);

    Call<AssignmentResponse> getAssignments(long[] assignmentsIds);

    Call<Void> postViewed(ViewAssignment stepAssignment);

    void loginWithSocial(Context context, SocialManager.SocialType type);

    Call<SearchResultResponse> getSearchResultsCourses(int page, String rawQuery);

    Call<CoursesStepicResponse> getCourses(int page, long[] ids);

    Call<AttemptResponse> createNewAttempt(long stepId);

    Call<SubmissionResponse> createNewSubmission(Reply reply, long attemptId);
}
