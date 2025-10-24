# MelonMessages

> Part of the **Melon Plugins** project - Paper and Folia-compatible plugins for
> easy Minecraft server admin.
> - [MelonPlugins on GitHub](https://github.com/MelonPlugins)
> - [MelonPlugins on Hangar](https://hangar.papermc.io/Melon)

MelonMessages allows you to easily configure different logging messages sent to
your server's chat, as well as change their color.

***Melon is in active development. Many features will be lacking, please request 
any features on our [GitHub page](https://github.com/MelonPlugins/MelonMessages)***

## Current message events that are editable

- `join` - Player joins
- `first-join` - Player joins for the first time
- `leave` - Player quits

## Configuration

Each editable event has a configuration format that looks similar to:

```yaml
join:
  message: "{player} joined the server"
  color: "#33aaff"
```

- `message` can be any string.
- `color` is a hex-code including the `#` that responds to the text color of
  the message.
