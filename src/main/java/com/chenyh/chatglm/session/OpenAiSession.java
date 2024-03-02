package com.chenyh.chatglm.session;

import com.chenyh.chatglm.model.*;
import com.chenyh.chatglm.model.ChatCompletionRequest;
import com.chenyh.chatglm.model.ChatCompletionSyncResponse;
import com.chenyh.chatglm.model.ImageCompletionRequest;
import com.chenyh.chatglm.model.ImageCompletionResponse;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

import java.util.concurrent.CompletableFuture;

/**
 * @description 会话服务接口
 */
public interface OpenAiSession {

    EventSource completions(ChatCompletionRequest chatCompletionRequest, EventSourceListener eventSourceListener) throws Exception;

    CompletableFuture<String> completions(ChatCompletionRequest chatCompletionRequest) throws Exception;

    ChatCompletionSyncResponse completionsSync(ChatCompletionRequest chatCompletionRequest) throws Exception;

    ImageCompletionResponse genImages(ImageCompletionRequest imageCompletionRequest) throws Exception;

    Configuration configuration();

}
