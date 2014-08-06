This is this a repository for people willing to work on an android app that will target Wallabag v2.

It is not in any way currently usable, and will never be usable for Wallabag v1. 

Thus, the app will not replace the ["InThePoche" android app](https://play.google.com/store/apps/details?id=fr.gaulupeau.apps.InThePoche) but exists side by side, maybe under a name like "Wallabag (BETA").

This application is released under GPL v3


# Plans

## Walabag v2

The current wallabag app is a customized rss-reader. 
We can do better, but not on Wallabag v1, for which no new features will be added.

So our target is Wallabag v2 https://github.com/wallabag/wallabag/tree/v2-silex

In particular, there is a draft of the future API in https://github.com/wallabag/wallabag/issues/414


## What will not be in the app at first

Since there will be few readers at first, since Wallabag v2 won't be deployed, we should not focus on the reading experience for users we won't have at first. The app could simply list all the articles, with their tags, that are in our bag.

No offline downloading. A button for opening the article in the users's favorite navigator or browser is enough.

No register process, let's the web part take care of that.


## What will be in the app at first

Straightforward one time login process. BAG url and its password should be enough. 

Integration with Google Push Messaging. Polling for new articles is a no-go.

Integration within android. We should be able to "Share" a link in Wallabag from anywhere in Android.

# UI Design

## User Interface

The app should contain a List view as its main Activity. In that view, all the saved articles should appear.

If the user has not set a Wallabag server, it should be asked on startup. The server settings should be placed in the settings menu.

A side drawer should also be available. In it, the most recent and/or the most popular tags should be easily accessible. A search option and a link to the settings menu should also be placed there.

Finally, when the user selects an article, it should open in a separate Activity that does not contain a sidebar and focuses on presenting as little irrelevant info (meaning other than the article) to the user as possible.