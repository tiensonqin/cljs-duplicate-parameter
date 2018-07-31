(ns cljs-duplicate-parameter.core)

(defn reproduce [{:keys [body_format]}]
  (let [body-format body_format]
    (fn []
      (prn body-format))))

(reproduce {:body_format :asciidoc})

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init"))

(defn stop []
  ;; stop is called before any code is reloaded
  ;; this is controlled by :before-load in the config
  (js/console.log "stop"))
