(ns ecseq.events
  (:require
   [re-frame.core :as re-frame]
   [ecseq.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
