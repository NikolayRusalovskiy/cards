package com.gl.anottkach;

@Service(name = "ProstoLazyService")
public class LazyService {
    @Init
    public void layinit() throws Exception {
        throw new Exception();
    }
}
