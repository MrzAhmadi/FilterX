package io.github.mrzahmadi.filterx.core;

import java.util.Map;

public interface Filter {
    boolean matches(Map<String, String> resource);
}