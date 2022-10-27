# Case Study: Form Builder

This is a case study about building a form builder. A form builder is a library for describing and rendering forms, and (optionally) a UI to construct forms. Our main focus is on creating a code library to describe forms in code.


## Design

We're going to start by doing a bit of a design exercise, moving beyond the pure coding exercises we've done so far.

You have used lots of forms on web sites and mobile apps. What do you think the main components of forms are? We can ignore layout specific issue and just focus on the elements that are core to the user interface. Try to come up with a description of at least a few components and perhaps some composition operators to combine components. It should be enough to describe some interesting forms, if not every form that you've used.

For example, you might say a form is a list of inputs, and input consists of an optional label, an optional description and an optional placeholder. (This is a very simple model. You probably want something a little bit more elaborate.)


## Builders

Your design probably includes lots of optional components.
