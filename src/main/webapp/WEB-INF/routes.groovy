all "/",                forward: "/index.groovy"
all "/g",               forward: "/random.groovy"
all "/g/upload",        forward: "/upload.groovy"
post "/g/save",         forward: "/store.groovy"
get "/g/browse",        forward: "/browse.groovy"
all "/i/@hash",         forward: "/load.groovy?hash=@hash"
all "/u/@hash",         forward: "/upvote.groovy?hash=@hash"
all "/m/@hash",         forward: "/mylist.groovy?hash=@hash"
all "/r/@hash",         forward: "/report.groovy?hash=@hash"
all "/p/@hash",         forward: "/picture.groovy?hash=@hash"
all "/d/@hash",         forward: "/delete.groovy?hash=@hash"
all "/favicon.ico",     redirect: "/images/gaelyk-small-favicon.png"
all "/robots.txt/",     redirect: "/robots.txt"
all "/humans.txt/",     redirect: "/humans.txt"
all "/cron/revalidate", forward: "/cron/revalidate.groovy"
all "/auth/github",     forward: "/auth/github.groovy"
all "/auth/me",         forward: "/auth/me.groovy"
all "/auth/logout",     forward: "/auth/logout.groovy"
