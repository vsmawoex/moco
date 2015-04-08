package com.github.dreamhead.moco.config;

import com.github.dreamhead.moco.MocoConfig;

import static com.github.dreamhead.moco.util.URLs.join;

public class MocoContextConfig implements MocoConfig<String> {
    private final String context;

    public MocoContextConfig(String context) {
        this.context = context;
    }

    @Override
    public boolean isFor(final String id) {
        return URI_ID.equalsIgnoreCase(id);
    }

    @Override
    public String apply(final String uri) {
        return join(context, uri);
    }
}
