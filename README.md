Error:

```
➜ cljs-duplicate-parameter yarn release
yarn run v1.1.0
warning package.json: No license field
$ shadow-cljs release app;
shadow-cljs - config: /home/tienson/codes/clj/cljs-duplicate-parameter/shadow-cljs.edn cli version: 2.4.25 node: v8.5.0
shadow-cljs - connected to server
[:app] Compiling ...
Closure compilation failed with 1 errors
--- cljs_duplicate_parameter/core.cljs:7
Parse error. Duplicate parameter name "body_format"
```
