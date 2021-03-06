package teammates.ui.webapi.request;

import java.util.List;

import teammates.ui.webapi.output.CommentVisibilityType;

/**
 * The create request of a feedback response comment.
 */
public class FeedbackResponseCommentCreateRequest extends FeedbackResponseCommentBasicRequest {

    public FeedbackResponseCommentCreateRequest(String commentText,
                                                List<CommentVisibilityType> showCommentTo,
                                                List<CommentVisibilityType> showGiverNameTo) {
        super(commentText, showCommentTo, showGiverNameTo);
    }
}
